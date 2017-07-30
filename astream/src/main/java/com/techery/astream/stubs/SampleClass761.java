package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass761 {

    @Ignore    private SampleClass762 sampleClass;

    public SampleClass761(){
        sampleClass = new SampleClass762();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}