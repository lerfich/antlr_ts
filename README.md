1. В корне папки с проектом запустить npm i
2. Грамматика уже написана в папке /grammar/TypescriptToPython.g4
3. Парсер/Лексер/Визитор (базовый) - сгенерированы в /lib
4. Дополнительный функции .visit прописаны в /codeGenerator/PythonGenerator
5. Чтобы проверить, что выдает транслятор на пайтон, запустите команду npm run start
6. Появится файл output_python_code.py

7. Чтобы изменить исходный файл на js, редактируйте содержимое /input/input_ts_code.
