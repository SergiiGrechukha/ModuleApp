package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1837 {

    @Ignore    private SampleClass1838 sampleClass;

    public SampleClass1837(){
        sampleClass = new SampleClass1838();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}