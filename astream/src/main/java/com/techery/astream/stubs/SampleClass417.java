package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass417 {

    @Ignore    private SampleClass418 sampleClass;

    public SampleClass417(){
        sampleClass = new SampleClass418();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}