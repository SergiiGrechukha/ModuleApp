package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1459 {

    @Ignore    private SampleClass1460 sampleClass;

    public SampleClass1459(){
        sampleClass = new SampleClass1460();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}