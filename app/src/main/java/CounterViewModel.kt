import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableIntStateOf

class CounterViewModel : ViewModel() {
    var counterValue = mutableIntStateOf(0)
        private set
}