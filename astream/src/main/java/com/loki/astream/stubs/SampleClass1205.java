package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1205 {

    @Ignore    private SampleClass1206 sampleClass;

    public SampleClass1205(){
        sampleClass = new SampleClass1206();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}