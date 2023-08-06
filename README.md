## Event storming и домены

![Agile Dead Trees (2)](https://github.com/k-vasiliev/async-arch-course/assets/20165325/1862a1f3-827f-4461-9735-0cc056d84b68)

На основе описания задачи и ES получились следующие домены:

#### User Identity Management

Отвечает за управление пользователями, авторизацию и регистрацию

События

| Событие     | Тип |
| ----------- | ----------- |
| UserRegistered       | Business event       |
| UserLoggined   | Business event        |
| UserUpdated   | CUD event       |

#### Task manager

Решает проблему производительности сотрудников при помощи таск менеджера

События

| Событие     | Тип |
| ----------- | ----------- |
| TaskCreated       | CUD event       |
| TaskAssigned   | Business event        |
| TaskCompleted   | Business event        |
| TaskUpdated   | CUD event    |

#### Accounting

Отвечает за выплату сотрудникам денег, хранение и показ финансовой информации

| Событие     | Тип |
| ----------- | ----------- |
| TaskGotWriteOffCost      | Business event       |
| TaskGotAccrualCost   | Business event        |
| TaskCompleted   | Business event        |
| TaskUpdated   | CUD        |

#### Audit

Строит аналитические отчеты для менеджмента

## Упрощенная модель данных 

![Agile Dead Trees (3)](https://github.com/k-vasiliev/async-arch-course/assets/20165325/7ad18ee7-2040-4bde-857f-8158c1918541)

Все запросы могут выполняться асинхронно
