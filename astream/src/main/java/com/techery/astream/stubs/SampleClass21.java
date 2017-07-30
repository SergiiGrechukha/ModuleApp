package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass21 {

    @Ignore    private SampleClass22 sampleClass;

    public SampleClass21(){
        sampleClass = new SampleClass22();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}