package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass422 {

    @Ignore    private SampleClass423 sampleClass;

    public SampleClass422(){
        sampleClass = new SampleClass423();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}