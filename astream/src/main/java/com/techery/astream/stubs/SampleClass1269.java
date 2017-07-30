package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1269 {

    @Ignore    private SampleClass1270 sampleClass;

    public SampleClass1269(){
        sampleClass = new SampleClass1270();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}