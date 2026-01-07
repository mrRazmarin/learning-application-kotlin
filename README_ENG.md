# 📱 Learning Application (Kotlin + Jetpack Compose)

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9%2B-blue?logo=kotlin&logoColor=white)](https://kotlinlang.org)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-1.6%2B-purple?logo=android&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Android](https://img.shields.io/badge/Android-7.0%2B-green?logo=android)](https://developer.android.com)

> 🧠 Educational project to learn core Android development concepts using the modern declarative UI toolkit — Jetpack Compose.  
> The goal is to build understanding of the declarative approach, state management and UI composition from the ground up by experimenting with basic and advanced Compose components.

---

## 🔍 What is already studied and implemented

### 🧱 Layout basics
- ✅ Row / Column — vertical and horizontal element placement
- ✅ Box — overlaying and arbitrary positioning
- ✅ Spacer, `weight`, `fillMaxWidth()` / `fillMaxHeight()`, `wrapContentSize()`
- ✅ `Arrangement.SpaceBetween` / `SpaceEvenly` / `spacedBy()` — controlling spacing between elements
- ✅ `Modifier` — key tool for sizing, padding, clickability, clipping, rounding, etc.

### 🎨 UI components
- ✅ Card — cards with elevation and rounded corners
- ✅ Image — loading from `drawable`, `contentScale`, `clip` (including `CircleShape`)
- ✅ Text — styling (size, weight, color)
- ✅ Icon — vector and raster icons inside `Button` and `IconButton`
- ✅ Button (Material 3) — customization of colors, states, sizes, disabling via `enabled`
- ✅ LazyColumn — efficient vertical scrolling for a list of cards/items (implemented)

### 🧠 State management
- ✅ `remember { mutableStateOf(...) }` — local state (e.g., name, profession)
- ✅ `remember { mutableIntStateOf(...) }` — optimized `Int` state for a counter
- ✅ Recomposition — automatic UI updates when state changes
- ✅ Conditional enablement (`enabled = counter > 0`) — UI reacting to state

### 🖼️ Advanced techniques (partially)
- ✅ `clickable` on `Card` — mimic button behavior without using `Button`
- ✅ `statusBarsPadding()` / `systemBarsPadding()` — adapt for notches and system bars
- ✅ Dynamic data generation — functions like `getRandomName()`, `getRandomProf()`
- ✅ Working with resources — `R.drawable.xxx`, `painterResource()` for images

---

## 📸 Screenshots

| Interface                                     | Behavior                                                                                  |
|-----------------------------------------------|-------------------------------------------------------------------------------------------|
| ![Interface screenshot](img/Screenshot_one.png) | Cards with avatar, name, profession and two control buttons (`+` / `-`) — demonstrates state handling and UI recomposition. |



---

## 💻 How to run (Quickstart)

Requirements:
- Android Studio Giraffe / Hedgehog (or newer)
- JDK 17+
- Minimum supported Android version: API 24 (Android 7.0) — check `app/build.gradle.kts` to confirm

Steps:
1. Clone the repository:
   git clone https://github.com/mrRazmarin/learning-application-kotlin.git
2. Open the project in Android Studio.
3. Wait for Gradle sync to finish.
4. Run the app on an emulator or physical device with API >= 24.

Commands (from project root):
- Build debug:
  ./gradlew assembleDebug
- Install on connected device:
  ./gradlew installDebug

---

## 🗂 Project structure (overview)
- app/ — application module (UI, resources, manifest)
- src/main/java|kotlin/... — packages with Compose UI implementations and logic
- res/drawable/ — images and icons
- img/ — screenshots used in README

---

## 🔎 Future plans
- [ ] ViewModel + State Hoisting — move logic out of UI
- [ ] Theming (`MaterialTheme`, `colorScheme`)
- [ ] Animations (`animate*AsState`, `Transition`)
- [ ] Navigation (`Navigation Compose`)
- [ ] Testing (`ComposeTestRule`)

---

## 🛠 Technical details
- **Language:** Kotlin
- **UI Toolkit:** Jetpack Compose (Material 3)
- **Min SDK:** 24 (Android 7.0)
- **IDE:** Android Studio Giraffe / Hedgehog
- **Gradle:** Kotlin DSL, Compose BOM recommended

---
