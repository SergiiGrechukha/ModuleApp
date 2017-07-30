package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1062 {

    @Ignore    private SampleClass1063 sampleClass;

    public SampleClass1062(){
        sampleClass = new SampleClass1063();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}