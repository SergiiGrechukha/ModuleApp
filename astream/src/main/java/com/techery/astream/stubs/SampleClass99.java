package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass99 {

    @Ignore    private SampleClass100 sampleClass;

    public SampleClass99(){
        sampleClass = new SampleClass100();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}