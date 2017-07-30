package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1509 {

    @Ignore    private SampleClass1510 sampleClass;

    public SampleClass1509(){
        sampleClass = new SampleClass1510();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}