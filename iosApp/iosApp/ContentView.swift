import SwiftUI
import shared

struct ContentView: View {
    @ObservedObject private(set) var viewModel: ViewModel

        var body: some View {
            List(viewModel.posts, id: \.id) {post in
                Spacer().padding(16)
                VStack(spacing: 16){
                    Text(post.title)
                    
                    Text(post.body)
                }
                .cornerRadius(8)
            }
            .padding(16)
        }
}

extension ContentView {
    class ViewModel: ObservableObject {
        @Published var text = "Loading..."
        @Published var posts = [Post]()
        
        let postsHelper = GetPostsHelper()
        init() {
            postsHelper.get {
                postsList, error in
                DispatchQueue.main.async {
                    if let postsList {self.posts += postsList} else {
                        
                    }
                }
            }
        
        }
    }
}
