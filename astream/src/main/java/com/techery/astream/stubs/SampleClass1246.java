package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1246 {

    @Ignore    private SampleClass1247 sampleClass;

    public SampleClass1246(){
        sampleClass = new SampleClass1247();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}