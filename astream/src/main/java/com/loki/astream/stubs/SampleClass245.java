package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass245 {

    @Ignore    private SampleClass246 sampleClass;

    public SampleClass245(){
        sampleClass = new SampleClass246();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}