package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass686 {

    @Ignore    private SampleClass687 sampleClass;

    public SampleClass686(){
        sampleClass = new SampleClass687();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}