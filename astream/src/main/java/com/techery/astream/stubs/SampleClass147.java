package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass147 {

    @Ignore    private SampleClass148 sampleClass;

    public SampleClass147(){
        sampleClass = new SampleClass148();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}