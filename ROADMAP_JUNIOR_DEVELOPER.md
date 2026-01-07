# 🗺️ Роадмап по Jetpack Compose для Junior Android Developer

> Цель: уметь **самостоятельно разрабатывать, тестировать и поддерживать экраны** в Compose-приложении, понимая *почему* так, а не иначе.  
> Акцент — на **качество**, **поддерживаемость** и **сотрудничество с командой**.

---

## ✅ 0. База: что уже должно быть (до Compose)
- [ ] Kotlin: `data class`, `sealed interface`, `coroutines`, `flow`, делегаты (`by lazy`, `by mutableStateOf`)
- [ ] Архитектура: базовое понимание `ViewModel`, `Repository`, `StateFlow`
- [ ] Gradle: как добавить зависимость, различие `implementation`/`api`

---

## 🚀 1. Основы Jetpack Compose (Core UI)

### 🔹 Структура Compose-экрана
- [ ] Писать `@Composable`-функции с `Column`/`Row`/`Box`
- [ ] Использовать `Modifier` для позиционирования, отступов, кликов
- [ ] Понимать разницу между `@Composable`, `Modifier`, `State`

### 🔹 Работа с состоянием
- [ ] `mutableStateOf`, `remember`, `derivedStateOf`
- [ ] `mutableStateListOf()` — добавление/удаление элементов
- [ ] Реактивность: почему `Text` обновляется при `count++`

### 🔹 Основные компоненты Material 3
- [ ] `Text`, `Button`, `OutlinedButton`, `IconButton`
- [ ] `TextField`, `Checkbox`, `Switch`, `RadioButton`
- [ ] `Card`, `Surface`, `Divider`

### 🔹 Списки и ленивые компоненты
- [ ] `LazyColumn`, `LazyRow`, `items()`, `itemsIndexed()`
- [ ] `key = { … }` — зачем и как использовать (уникальный ID!)
- [ ] `itemContentPadding`, `verticalArrangement`

---

## ⚙️ 2. Продвинутые темы (уже в продакшене)

### 🔹 Управление состоянием правильно
- [ ] Отделять **UI-состояние** (`remember`) от **бизнес-состояния** (`ViewModel` + `StateFlow`)
- [ ] Паттерн: `State → UI`, `Event → ViewModel → New State`
- [ ] Избегать `mutableStateOf` в `ViewModel`

### 🔹 Навигация
- [ ] `NavHost`, `composable`, `NavController`
- [ ] Передача аргументов: `navController.navigate("profile/$id")`
- [ ] `popUpTo`, `launchSingleTop`

### 🔹 Тестирование
- [ ] Писать **UI-тесты** на `@Composable` через `createComposeRule()`
- [ ] Проверять: видимость элемента, содержимое `Text`, реакция на клик
- [ ] Использовать `onNodeWithTag("...")`, `assertTextContains(...)`

### 🔹 Анимации и обратная связь
- [ ] `animate*AsState` — плавные переходы (цвет, размер, альфа)
- [ ] `updateTransition` — для сложных состояний (collapsed/expanded)
- [ ] `Modifier.clickable { }` — ripple по умолчанию, кастомизация через `indication`

---

## 🧩 3. Практические сценарии (что точно спросят на собесе)

| Задача | Что должен уметь |
|--------|------------------|
| **Карточка с раскрывающимся текстом** | `AnimatedVisibility`, `expandVertically`, `remember { mutableStateOf(false) }` |
| **Список с удалением по свайпу** | `swipeable`, `AnimatedVisibility`, `key` в `LazyColumn` |
| **Форма с валидацией** | `TextField(value, onValueChange)`, `derivedStateOf { text.isNotBlank() }`, визуальная индикация ошибки |
| **Загрузка / ошибка / контент** | `when (state) { is Loading -> … is Success -> … }`, `Box` с `Modifier.fillMaxSize()` |
| **Передача данных вниз по дереву** | Параметры composable-функций, **не** глобальные переменные |

---

## 🔒 4. Качество и поддержка

### 🔹 Поддерживаемый код
- [ ] Выносить логику в `fun`, а не в `@Composable`
- [ ] Дробить большие `@Composable` на маленькие (Single Responsibility)
- [ ] Документировать сложные composable через KDoc

### 🔹 Производительность
- [ ] Избегать `SideEffect`/`LaunchedEffect` без ключей
- [ ] Не создавать объекты внутри `@Composable` (лишние recomposition)
- [ ] Использовать `remember` для тяжёлых вычислений

### 🔹 Сотрудничество
- [ ] Писать `README.md` с `<details>` для скриншотов и архитектуры
- [ ] Использовать `@Preview` с разными параметрами (`device`, `locale`, `dark/light`)
- [ ] Соблюдать стиль: `ktlint`, `detekt`, CI-check

---

## 🎯 Финальная цель Junior (через 3–6 месяцев)

> **Могу взять задачу из Jira: «Сделать экран профиля — фото, имя, список навыков (expandable), кнопка “Редактировать”» — и реализовать её от UI до ViewModel, с тестами и PR.**

---
