package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1803 {

    @Ignore    private SampleClass1804 sampleClass;

    public SampleClass1803(){
        sampleClass = new SampleClass1804();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}