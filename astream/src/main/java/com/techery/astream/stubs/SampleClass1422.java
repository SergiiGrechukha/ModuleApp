package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1422 {

    @Ignore    private SampleClass1423 sampleClass;

    public SampleClass1422(){
        sampleClass = new SampleClass1423();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}