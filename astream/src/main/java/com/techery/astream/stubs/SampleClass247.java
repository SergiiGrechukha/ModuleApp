package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass247 {

    @Ignore    private SampleClass248 sampleClass;

    public SampleClass247(){
        sampleClass = new SampleClass248();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}