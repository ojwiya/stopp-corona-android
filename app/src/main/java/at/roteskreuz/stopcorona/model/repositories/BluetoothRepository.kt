package at.roteskreuz.stopcorona.model.repositories

import android.bluetooth.BluetoothAdapter

/**
 * wrapper for Bluetooth related functionality
 */
class BluetoothRepository(
    private val bluetoothAdapter: BluetoothAdapter

){
    fun isBluetoothEnabled(): Boolean {
        return bluetoothAdapter.isEnabled
    }
}