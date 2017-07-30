package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass982 {

    @Ignore    private SampleClass983 sampleClass;

    public SampleClass982(){
        sampleClass = new SampleClass983();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}