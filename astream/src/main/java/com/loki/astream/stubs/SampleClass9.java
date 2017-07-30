package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass9 {

    @Ignore    private SampleClass10 sampleClass;

    public SampleClass9(){
        sampleClass = new SampleClass10();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}