package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass91 {

    @Ignore    private SampleClass92 sampleClass;

    public SampleClass91(){
        sampleClass = new SampleClass92();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}