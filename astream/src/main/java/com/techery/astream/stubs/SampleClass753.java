package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass753 {

    @Ignore    private SampleClass754 sampleClass;

    public SampleClass753(){
        sampleClass = new SampleClass754();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}