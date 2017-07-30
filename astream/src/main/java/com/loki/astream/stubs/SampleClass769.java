package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass769 {

    @Ignore    private SampleClass770 sampleClass;

    public SampleClass769(){
        sampleClass = new SampleClass770();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}