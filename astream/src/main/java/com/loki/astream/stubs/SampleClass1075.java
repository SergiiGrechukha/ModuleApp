package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1075 {

    @Ignore    private SampleClass1076 sampleClass;

    public SampleClass1075(){
        sampleClass = new SampleClass1076();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}