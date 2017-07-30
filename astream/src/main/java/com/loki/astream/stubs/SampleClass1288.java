package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1288 {

    @Ignore    private SampleClass1289 sampleClass;

    public SampleClass1288(){
        sampleClass = new SampleClass1289();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}