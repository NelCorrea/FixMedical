import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeadNavsComponent } from './head-navs.component';

describe('HeadNavsComponent', () => {
  let component: HeadNavsComponent;
  let fixture: ComponentFixture<HeadNavsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeadNavsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HeadNavsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
