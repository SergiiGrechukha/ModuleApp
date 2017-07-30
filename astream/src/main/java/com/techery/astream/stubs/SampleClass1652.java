package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1652 {

    @Ignore    private SampleClass1653 sampleClass;

    public SampleClass1652(){
        sampleClass = new SampleClass1653();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}