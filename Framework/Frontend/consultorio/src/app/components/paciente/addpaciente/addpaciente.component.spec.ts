import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddpacienteComponent } from './addpaciente.component';

describe('AddpacienteComponent', () => {
  let component: AddpacienteComponent;
  let fixture: ComponentFixture<AddpacienteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddpacienteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddpacienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
