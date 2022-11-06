import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditpacienteComponent } from './editpaciente.component';

describe('EditpacienteComponent', () => {
  let component: EditpacienteComponent;
  let fixture: ComponentFixture<EditpacienteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditpacienteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditpacienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
