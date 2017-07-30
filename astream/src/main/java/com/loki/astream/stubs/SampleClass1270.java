package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1270 {

    @Ignore    private SampleClass1271 sampleClass;

    public SampleClass1270(){
        sampleClass = new SampleClass1271();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}