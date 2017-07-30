package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass121 {

    @Ignore    private SampleClass122 sampleClass;

    public SampleClass121(){
        sampleClass = new SampleClass122();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}