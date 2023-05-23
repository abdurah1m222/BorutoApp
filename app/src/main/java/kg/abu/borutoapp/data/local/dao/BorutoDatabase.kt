package kg.abu.borutoapp.data.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import kg.abu.borutoapp.domain.model.Hero
import kg.abu.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao

    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao

}