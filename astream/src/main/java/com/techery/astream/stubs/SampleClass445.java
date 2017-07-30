package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass445 {

    @Ignore    private SampleClass446 sampleClass;

    public SampleClass445(){
        sampleClass = new SampleClass446();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}