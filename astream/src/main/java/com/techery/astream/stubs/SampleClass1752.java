package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1752 {

    @Ignore    private SampleClass1753 sampleClass;

    public SampleClass1752(){
        sampleClass = new SampleClass1753();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}