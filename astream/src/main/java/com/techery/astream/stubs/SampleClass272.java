package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass272 {

    @Ignore    private SampleClass273 sampleClass;

    public SampleClass272(){
        sampleClass = new SampleClass273();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}