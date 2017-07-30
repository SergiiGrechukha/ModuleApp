package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass68 {

    @Ignore    private SampleClass69 sampleClass;

    public SampleClass68(){
        sampleClass = new SampleClass69();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}