package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1034 {

    @Ignore    private SampleClass1035 sampleClass;

    public SampleClass1034(){
        sampleClass = new SampleClass1035();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}