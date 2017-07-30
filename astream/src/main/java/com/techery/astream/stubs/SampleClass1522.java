package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1522 {

    @Ignore    private SampleClass1523 sampleClass;

    public SampleClass1522(){
        sampleClass = new SampleClass1523();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}