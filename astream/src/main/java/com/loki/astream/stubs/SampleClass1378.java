package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1378 {

    @Ignore    private SampleClass1379 sampleClass;

    public SampleClass1378(){
        sampleClass = new SampleClass1379();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}