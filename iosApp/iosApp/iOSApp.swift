import SwiftUI
import shared

@main
struct iOSApp: App {
    
    init() {
        initDi()
    }
    
    func initDi() {
        DiHelperKt.doInitKoin()
    }
    
	var body: some Scene {
		WindowGroup {
            ContentView(viewModel: ContentView.ViewModel())
		}
	}
}
