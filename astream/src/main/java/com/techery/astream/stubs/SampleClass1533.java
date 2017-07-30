package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1533 {

    @Ignore    private SampleClass1534 sampleClass;

    public SampleClass1533(){
        sampleClass = new SampleClass1534();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}