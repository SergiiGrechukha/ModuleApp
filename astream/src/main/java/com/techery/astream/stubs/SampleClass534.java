package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass534 {

    @Ignore    private SampleClass535 sampleClass;

    public SampleClass534(){
        sampleClass = new SampleClass535();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}