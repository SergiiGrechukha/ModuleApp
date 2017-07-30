package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1864 {

    @Ignore    private SampleClass1865 sampleClass;

    public SampleClass1864(){
        sampleClass = new SampleClass1865();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}