package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass429 {

    @Ignore    private SampleClass430 sampleClass;

    public SampleClass429(){
        sampleClass = new SampleClass430();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}