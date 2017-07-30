package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1423 {

    @Ignore    private SampleClass1424 sampleClass;

    public SampleClass1423(){
        sampleClass = new SampleClass1424();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}