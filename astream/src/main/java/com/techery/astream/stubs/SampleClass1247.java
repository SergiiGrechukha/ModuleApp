package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1247 {

    @Ignore    private SampleClass1248 sampleClass;

    public SampleClass1247(){
        sampleClass = new SampleClass1248();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}