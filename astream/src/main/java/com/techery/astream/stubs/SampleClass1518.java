package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1518 {

    @Ignore    private SampleClass1519 sampleClass;

    public SampleClass1518(){
        sampleClass = new SampleClass1519();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}