# 📱 Learning Application (Kotlin + Jetpack Compose)

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9%2B-blue?logo=kotlin&logoColor=white)](https://kotlinlang.org)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-1.6%2B-purple?logo=android&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Android](https://img.shields.io/badge/Android-7.0%2B-green?logo=android)](https://developer.android.com)

> 🧠 Обучающий проект для освоения фундаментальных концепций Android-разработки с использованием **modern UI toolkit — Jetpack Compose**.  
> Цель — построить понимание декларативного подхода, управления состоянием и компоновки интерфейса «с нуля».

---

## 🔍 Что уже изучено и реализовано

### 🧱 Основы компоновки (Layout)
- ✅ **`Row` / `Column`** — вертикальное и горизонтальное расположение элементов
- ✅ **`Box`** — наложение и произвольное позиционирование
- ✅ **`Spacer`**, `weight`, `fillMaxWidth/Height`, `wrapContentSize`
- ✅ **`Arrangement.SpaceBetween` / `SpaceEvenly` / `spacedBy()`** — контроль расстояний между элементами
- ✅ **`Modifier`** — ключевой инструмент для размеров, отступов, кликабельности, скруглений и т.д.

### 🎨 Компоненты UI
- ✅ **`Card`** — карточки с elevation, закруглёнными углами
- ✅ **`Image`** — загрузка из `drawable`, `contentScale`, `clip` (в т.ч. `CircleShape`)
- ✅ **`Text`** — стилизация (размер, вес, цвет)
- ✅ **`Icon`** — векторные и растровые иконки внутри `Button` и `IconButton`
- ✅ **`Button` (Material 3)** — кастомизация цветов, состояний, размеров, отключение через `enabled`

### 🧠 Управление состоянием
- ✅ **`remember { mutableStateOf(...) }`** — локальное состояние (имя, профессия)
- ✅ **`remember { mutableIntStateOf(...) }`** — оптимизированный `Int`-state для счётчика
- ✅ **Recomposition** — автоматическое обновление UI при изменении state
- ✅ Условная активность (`enabled = counter > 0`) — реакция на состояние

### 🖼️ Продвинутые техники (частично)
- ✅ **`clickable` на `Card`** — имитация поведения кнопки без `Button`
- ✅ **`statusBarsPadding()` / `systemBarsPadding()`** — адаптация под нотч и системные панели
- ✅ **Динамическая генерация данных** — `getRandomName()`, `getRandomProf()`
- ✅ Работа с **ресурсами** — `R.drawable.xxx`, `painterResource()`

---

## 📸 Скриншоты

| Интерфейс                                      | Поведение                                                                            |
|------------------------------------------------|--------------------------------------------------------------------------------------|
| ![Скриншот интерфейса](img/Screenshot_one.png) | Карточки с аватаром, именем, профессией, двумя кнопками управления (`+`/`–`) и счётчиком |


---

## 🚀 Планы на будущее
- [ ] `LazyColumn` — эффективный скролл для большого числа карточек
- [ ] `ViewModel` + `StateHoisting` — вынос логики из UI
- [ ] Темизация (`MaterialTheme`, `colorScheme`)
- [ ] Анимации (`animate*AsState`, `Transition`)
- [ ] Навигация (`Navigation Compose`)
- [ ] Тестирование (`ComposeTestRule`)

---

## 🛠 Технические детали
- **Язык:** Kotlin
- **UI Toolkit:** Jetpack Compose (Material 3)
- **Min SDK:** 24 (Android 7.0)
- **IDE:** Android Studio Giraffe / Hedgehog
- **Gradle:** Kotlin DSL, Compose BOM

---